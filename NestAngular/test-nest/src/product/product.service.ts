import { Injectable } from '@nestjs/common';
import { Model } from 'mongoose';
import { InjectModel } from '@nestjs/mongoose';

import { Product } from './interfaces/product.interfaces';
import { CreateProductDTO } from './dto/product.dto';

@Injectable()
export class ProductService {
  constructor(@InjectModel('Product') private productModel: Model<Product>) {}

  async getProducts(): Promise<Product[]> {
    const products = await this.productModel.find();
    return products;
  }

  async getProduct(productID: string): Promise<Product> {
    const product = await this.productModel.findById(productID);
    return product;
  }

  async createProduct(createProductDTO: CreateProductDTO): Promise<Product> {
    const product = new this.productModel(createProductDTO);
    return await product.save();
  }

  async deleteProduct(productID: string): Promise<Product> {
    const product = await this.productModel.findByIdAndDelete(productID);
    return product;
  }

  async updateProduct(
    productID: string,
    editProductDTO: CreateProductDTO,
  ): Promise<Product> {
    const product = await this.productModel.findByIdAndUpdate(
      productID,
      editProductDTO,
      {
        new: true,
      },
    );

    return product;
  }
}
