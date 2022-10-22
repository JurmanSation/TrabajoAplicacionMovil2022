package dio.kjasd.ddam.ui.hablemos;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dio.kjasd.ddam.R;

public class HablemosFragment extends Fragment {

    Button btnFavoritos;

    private HablemosViewModel mViewModel;

    public static HablemosFragment newInstance() {
        return new HablemosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hablemos, container, false);

        btnFavoritos = view.findViewById(R.id.btnFavoritos);
        btnFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new FavoritosFragment();
                FragmentTransaction transaction = getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction();

                transaction.replace(R.id.Hablemoscontainer,fragment)
                        .commit();
            }
        });

return view;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HablemosViewModel.class);

    }


}