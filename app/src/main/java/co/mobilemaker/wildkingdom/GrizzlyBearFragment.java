package co.mobilemaker.wildkingdom;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GrizzlyBearFragment extends Fragment {


    public GrizzlyBearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_grizzly_bear,container,false);
        prepareContinueButton(rootView);
        return rootView;
    }

    private void prepareContinueButton(View rootView) {
        Button mContinueButton = (Button)rootView.findViewById(R.id.button_next);
        mContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.goToAnimal(new WombatFragment(), MainActivity.WOMBAT);
            }
        });
    }


}
