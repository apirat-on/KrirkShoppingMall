package apirat.krirk.ac.th.krirkshoppingmall.fragmant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apirat.krirk.ac.th.krirkshoppingmall.R;

/**
 * Created by playn on 3/6/2018.
 */

public class RegisterFragmant extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragmant_register, container, false);
        return view;
    }
}
