package com.kaierwen.android.mvvm.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.kaierwen.android.mvvm.R;
import com.kaierwen.android.mvvm.databinding.ListFragmentBinding;

/**
 * @author kaiyuan.zhang
 * @since 2019/4/26 10:33
 */
public class ProductListFragment extends Fragment {

    private ListFragmentBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.list_fragment,container,false);

        return mBinding.getRoot();
    }
}
