package com.rikenmaharjan.w5_p3;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopLeft extends Fragment {


    ImageView imageViewMain;



    ArrayList<String> buttonPressed =  new ArrayList<String>();


    TextView textViewHint;

    Button btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ,btnRestart;







    public TopLeft() {
        // Required empty public constructor
    }


    TopLeftListener activityCommander;


    public interface TopLeftListener{

        public void sendalphabhet(View view);


    }

    public void onAttach(Context context) {   //The onAttach method, binds the fragment to the owner.  Fragments are hosted by Activities, therefore, context refers to: ____________?
        super.onAttach(context);
        activityCommander  = (TopLeftListener) context;  //context is a handle to the main activity, let's bind it to our interface.
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top_left, container, false);



        settingUpGui(view);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);

            }
        });



        return view;
    }








    public void buttonClicked(View v){

        activityCommander.sendalphabhet(v);


    }

    private void settingUpGui(View v){

        // editText1 = (EditText) findViewById(R.id.editText1);



        btnA = (Button) v.findViewById(R.id.btnA);
        btnB = (Button) v.findViewById(R.id.btnB);
        btnC = (Button) v.findViewById(R.id.btnC);
        btnD = (Button) v.findViewById(R.id.btnD);
        btnE = (Button) v.findViewById(R.id.btnE);
        btnF = (Button) v.findViewById(R.id.btnF);
        btnG = (Button) v.findViewById(R.id.btnG);
        btnH = (Button) v.findViewById(R.id.btnH);
        btnI = (Button) v.findViewById(R.id.btnI);
        btnJ = (Button) v.findViewById(R.id.btnJ);
        btnK = (Button) v.findViewById(R.id.btnK);
        btnL = (Button) v.findViewById(R.id.btnL);
        btnM = (Button) v.findViewById(R.id.btnM);
        btnN = (Button) v.findViewById(R.id.btnN);
        btnO = (Button) v.findViewById(R.id.btnO);
        btnP = (Button) v.findViewById(R.id.btnP);
        btnQ = (Button) v.findViewById(R.id.btnQ);
        btnR = (Button) v.findViewById(R.id.btnR);
        btnS = (Button) v.findViewById(R.id.btnS);
        btnT = (Button) v.findViewById(R.id.btnT);
        btnU = (Button) v.findViewById(R.id.btnU);
        btnV = (Button) v.findViewById(R.id.btnV);
        btnW = (Button) v.findViewById(R.id.btnW);
        btnX = (Button) v.findViewById(R.id.btnX);
        btnY = (Button) v.findViewById(R.id.btnY);
        btnZ = (Button) v.findViewById(R.id.btnZ);

















    }


    public void disableAllButton(){



        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btnG.setEnabled(false);
        btnH.setEnabled(false);
        btnI.setEnabled(false);
        btnJ.setEnabled(false);
        btnK.setEnabled(false);
        btnL.setEnabled(false);
        btnM.setEnabled(false);
        btnN.setEnabled(false);
        btnO.setEnabled(false);
        btnP.setEnabled(false);
        btnQ.setEnabled(false);
        btnR.setEnabled(false);
        btnS.setEnabled(false);
        btnT.setEnabled(false);
        btnU.setEnabled(false);
        btnV.setEnabled(false);
        btnW.setEnabled(false);
        btnX.setEnabled(false);
        btnY.setEnabled(false);
        btnZ.setEnabled(false);


    }


    public void enableAllButton(){

        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnV.setEnabled(true);
        btnW.setEnabled(true);
        btnX.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);
    }

    public void buttonVisible(){



        btnA.setVisibility(View.VISIBLE);
        btnB.setVisibility(View.VISIBLE);
        btnC.setVisibility(View.VISIBLE);
        btnD.setVisibility(View.VISIBLE);
        btnE.setVisibility(View.VISIBLE);
        btnF.setVisibility(View.VISIBLE);
        btnG.setVisibility(View.VISIBLE);
        btnH.setVisibility(View.VISIBLE);
        btnI.setVisibility(View.VISIBLE);
        btnJ.setVisibility(View.VISIBLE);
        btnK.setVisibility(View.VISIBLE);
        btnL.setVisibility(View.VISIBLE);
        btnM.setVisibility(View.VISIBLE);
        btnN.setVisibility(View.VISIBLE);
        btnO.setVisibility(View.VISIBLE);
        btnP.setVisibility(View.VISIBLE);
        btnQ.setVisibility(View.VISIBLE);
        btnR.setVisibility(View.VISIBLE);
        btnS.setVisibility(View.VISIBLE);
        btnT.setVisibility(View.VISIBLE);
        btnU.setVisibility(View.VISIBLE);
        btnV.setVisibility(View.VISIBLE);
        btnW.setVisibility(View.VISIBLE);
        btnX.setVisibility(View.VISIBLE);
        btnY.setVisibility(View.VISIBLE);
        btnZ.setVisibility(View.VISIBLE);



    }




}
