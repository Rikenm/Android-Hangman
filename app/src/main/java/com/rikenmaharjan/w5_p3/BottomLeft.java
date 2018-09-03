package com.rikenmaharjan.w5_p3;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomLeft extends Fragment {


    TextView txtViewHint;
    Button btnRestart;
    View view;


    public BottomLeft() {
        // Required empty public constructor
    }


    BottomLeftListener activityCommander2;


    public interface BottomLeftListener{

        public void restartButton(View view);


    }


    public void onAttach(Context context) {   //The onAttach method, binds the fragment to the owner.  Fragments are hosted by Activities, therefore, context refers to: ____________?
        super.onAttach(context);
        activityCommander2  = (BottomLeftListener) context;  //context is a handle to the main activity, let's bind it to our interface.
    }

    //static


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_bottom_left, container, false);

        txtViewHint = (TextView) view.findViewById(R.id.txtViewHint);
        btnRestart = (Button) view.findViewById(R.id.btnRestart);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnRestartActivate(view);

                //Log.i("hello","hello");

            }
        });


        return view;
    }

    public void setHint(String msg)
    {
        txtViewHint.setText(msg);
    }




    public void btnRestartActivate(View v ) {

        //Log.i("hello","hello");

        activityCommander2.restartButton(v);
        //hello
    }


    public void btnRestartInvisible(){

        btnRestart.setVisibility(View.INVISIBLE);

    }

    public void btnRestartVisible(){

        btnRestart.setVisibility(View.VISIBLE);
    }




}
