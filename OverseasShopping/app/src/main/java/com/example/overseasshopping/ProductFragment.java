package com.example.overseasshopping;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.overseasshopping.Model.Product;
import com.example.overseasshopping.Model.User;

public class ProductFragment extends Fragment {
    private Product mProduct;
    private EditText mProductName;
    private EditText mProductPrice;
    private EditText mProductQuantity;
    private EditText mProductDescription;
    private Button mPostProductButton;
    private DatabaseHelper db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProduct = new Product();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_product, container, false);

        db = new DatabaseHelper(getActivity());
        User user = new User("ki", "ki",null,null,"23", "23", null, 23, 23);
        db.addUser(user);
        Product product = new Product("ha", "ha", "XD", 21, 32);
        db.addProduct(product, user);

        mProductName = (EditText) v.findViewById(R.id.product_name);
        mProductName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mProduct.setProductName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Intentionally left blank
            }
        });

        mProductPrice = (EditText) v.findViewById(R.id.product_price);
        mProductPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mProduct.setPrice(Integer.parseInt(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Intentionally left blank
            }
        });

        mProductQuantity = (EditText) v.findViewById(R.id.product_quantity);
        mProductQuantity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mProduct.setProductQuantity(Integer.parseInt(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Intentionally left blank
            }
        });

        mProductDescription = (EditText) v.findViewById(R.id.product_description);
        mProductDescription.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mProduct.setDescription(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Intentionally left blank
            }
        });

        mPostProductButton = (Button) v.findViewById(R.id.post_product_button);
        mPostProductButton.setEnabled(true);

        return v;
    }
}
