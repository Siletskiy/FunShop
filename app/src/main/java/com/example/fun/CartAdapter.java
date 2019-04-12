package com.example.fun;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter {


    private List<CartItemModel> cartItemModelList;

    public CartAdapter(List<CartItemModel> cartItemModelList) {
        this.cartItemModelList = cartItemModelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (cartItemModelList.get(position).getType()) {
            case 0:
                return CartItemModel.CART_ITEM;

            case 1:
                return CartItemModel.TOTAL_AMOUNG;

            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        switch (viewType) {
            case CartItemModel.CART_ITEM:
                View cartitemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cart_item_layout, viewGroup, false);
                return new CartItemViewholder(cartitemview);
            case CartItemModel.TOTAL_AMOUNG:
                View cardtotalview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cart_total_amoung_layout, viewGroup, false);
                return new CartTotalAmoungViewholde(cardtotalview);

            default:
                return null;
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (cartItemModelList.get(position).getType()) {
            case CartItemModel.CART_ITEM:
                int resource = cartItemModelList.get(position).getProductImage();
                String title = cartItemModelList.get(position).getProductTile();
                int freeCoupens = cartItemModelList.get(position).getFreeCoupens();
                String productPrice = cartItemModelList.get(position).getProductPrice();
                String cuttedPrice = cartItemModelList.get(position).getCuttePrice();
                int offersApplied = cartItemModelList.get(position).getOffersApplied();

                ((CartItemViewholder) viewHolder).setItemDetails(resource, title, freeCoupens, productPrice, cuttedPrice, offersApplied);

                break;
            case CartItemModel.TOTAL_AMOUNG:
                String totalItems = cartItemModelList.get(position).getTotalItems();
                String totalItemsPrice = cartItemModelList.get(position).getTotalItemPrice();
                String deliveryPrice = cartItemModelList.get(position).getDeliveryPrice();
                String totalAmount = cartItemModelList.get(position).getTotalAmount();
                String savedAmount = cartItemModelList.get(position).getSavedAmount();


                ((CartTotalAmoungViewholde) viewHolder).setTotalAmong(totalItems, totalItemsPrice, deliveryPrice, totalAmount, savedAmount);


                break;
            default:
                return;
        }

    }

    @Override
    public int getItemCount() {
        return cartItemModelList.size();
    }

    class CartItemViewholder extends RecyclerView.ViewHolder {

        private ImageView productImage;
        private ImageView freeCoupenIcon;
        private TextView productTitle;
        private TextView freeCoupens;
        private TextView productPrice;
        private TextView cuttedPrice;
        private TextView offersAplied;
        private TextView coupenApplied;
        private TextView productQuaantity;

        public CartItemViewholder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_title);
            freeCoupenIcon = itemView.findViewById(R.id.free_coupen_icon);
            freeCoupens = itemView.findViewById(R.id.tv_free_coupen);
            productPrice = itemView.findViewById(R.id.product_price);
            cuttedPrice = itemView.findViewById(R.id.culted_price);
            offersAplied = itemView.findViewById(R.id.offers_applied);
            coupenApplied = itemView.findViewById(R.id.coupen_applied);
            productQuaantity = itemView.findViewById(R.id.product_quantiti);


        }

        private void setItemDetails(int resourse, String title, int freeCoupensNo, String productPriceText, String cuttedPriceText, int offersAppliedNo) {
            productImage.setImageResource(resourse);
            productTitle.setText(title);
            if (freeCoupensNo > 0) {
                if (freeCoupensNo == 1) {
                    freeCoupenIcon.setVisibility(View.VISIBLE);
                    freeCoupens.setVisibility(View.VISIBLE);
                    freeCoupens.setText("free " + freeCoupensNo + "Coupen");

                } else {
                    freeCoupens.setText("free " + freeCoupensNo + "Coupens");
                }

            } else {
                freeCoupenIcon.setVisibility(View.INVISIBLE);
                freeCoupens.setVisibility(View.INVISIBLE);
            }

            productPrice.setText(productPriceText);
            cuttedPrice.setText(cuttedPriceText);
            if (offersAppliedNo > 0) {
                offersAplied.setVisibility(View.VISIBLE);
                offersAplied.setText(offersAppliedNo + " Offers aplied");
            } else {
                offersAplied.setVisibility(View.INVISIBLE);
            }
        }
    }

    class CartTotalAmoungViewholde extends RecyclerView.ViewHolder {
        private TextView totalItems;
        private TextView totalItemPrice;
        private TextView deliveryPrice;
        private TextView totalAmong;
        private TextView savedAmount;

        public CartTotalAmoungViewholde(@NonNull View itemView) {
            super(itemView);

            totalItems = itemView.findViewById(R.id.total_items);
            totalItemPrice = itemView.findViewById(R.id.total_items_price);
            deliveryPrice = itemView.findViewById(R.id.delivery_price);
            totalAmong = itemView.findViewById(R.id.total_price);
            savedAmount = itemView.findViewById(R.id.saved_amount);
        }

        private void setTotalAmong(String totalItemText, String totalItemPriceText, String deliveryPriceText, String totalAmountText, String savedAmoutText) {
            totalItems.setText(totalItemText);
            totalItemPrice.setText(totalItemPriceText);
            deliveryPrice.setText(deliveryPriceText);
            totalAmong.setText(totalAmountText);
            savedAmount.setText(savedAmoutText);

        }
    }

}
