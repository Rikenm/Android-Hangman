package com.rikenmaharjan.w5_p3;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Right extends Fragment {


    ImageView imageViewMain;
    LinearLayout ll;



    public Right() {
        // Required empty public constructor
    }


    //just static


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_right, container, false);

        imageViewMain = view.findViewById(R.id.imageView2);
        ll = (LinearLayout) view.findViewById(R.id.linearLayoutEdit);



        return view;
    }

    public void setDefaultImage(){

        imageViewMain.setImageResource(R.drawable.step0);

    }

    public void wrongMove(int game_state){

        if (game_state >= 7){

            //you lost



            //restart // create a button
            imageViewMain.setImageResource(R.drawable.step7);


            //btnRestart.setVisibility(View.VISIBLE);




            game_state = 7;

        }

        else{

            switch(game_state){

                case 1:
                    imageViewMain.setImageResource(R.drawable.step1);
                    break;
                case 2:
                    imageViewMain.setImageResource(R.drawable.step2);
                    break;

                case 3:
                    imageViewMain.setImageResource(R.drawable.step3);
                    break;


                case 4:
                    imageViewMain.setImageResource(R.drawable.step4);
                    break;

                case 5:
                    imageViewMain.setImageResource(R.drawable.step5);
                    break;

                case 6:
                    imageViewMain.setImageResource(R.drawable.step6);
                    break;



            }

            //change the game


        }





    }







}
