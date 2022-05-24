import { Product } from './product';
import { CartItem } from './cart-item';

describe('CartItem', () => {
  it('should create an instance', () => {
    expect(new CartItem(new Product)).toBeTruthy();
  });
});
