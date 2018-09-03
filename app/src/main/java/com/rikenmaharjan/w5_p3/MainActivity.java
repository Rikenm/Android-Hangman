package com.rikenmaharjan.w5_p3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TopLeft.TopLeftListener, BottomLeft.BottomLeftListener {


    private String[] games = {"Ant", "Apple", "Bannana","Dog","BU"};

    String[] Hint = {"Insect","Fruit","Fruit","Pet","University"};

    int game_state = 0;

    int solved = 0;

    String currentgame = games[0].toLowerCase();

    int numberOfLines = currentgame.length();

    int gameNumber = 0;

    ImageView imageViewMain;



    ArrayList<String> buttonPressed =  new ArrayList<String>();


    TextView textViewHint;

    Button btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ,btnRestart;

    LinearLayout ll;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomLeft receiving = (BottomLeft) getFragmentManager().findFragmentById(R.id.BottomLeft);
        Right receivingImage =  (Right) getFragmentManager().findFragmentById(R.id.Right);
        receivingImage.setDefaultImage();
        receiving.setHint(Hint[gameNumber]);
        ll = receivingImage.ll;

        receiving.btnRestartInvisible();
        Add_Line(currentgame.length(),ll);






    }

    @Override
    public void sendalphabhet(View view) {

        Right receivingImage = (Right) getFragmentManager().findFragmentById(R.id.Right);
        BottomLeft receiving = (BottomLeft) getFragmentManager().findFragmentById(R.id.BottomLeft);
        TopLeft buttonsProperty = (TopLeft) getFragmentManager().findFragmentById(R.id.TopLeft);




        btnA = view.findViewById(R.id.btnA);
        btnB = view.findViewById(R.id.btnB);
        btnC = view.findViewById(R.id.btnC);
        btnD = view.findViewById(R.id.btnD);
        btnE = view.findViewById(R.id.btnE);
        btnF = view.findViewById(R.id.btnF);
        btnG = view.findViewById(R.id.btnG);
        btnH = view.findViewById(R.id.btnH);
        btnI = view.findViewById(R.id.btnI);
        btnJ = view.findViewById(R.id.btnJ);
        btnK = view.findViewById(R.id.btnK);
        btnL = view.findViewById(R.id.btnL);
        btnM = view.findViewById(R.id.btnM);
        btnN = view.findViewById(R.id.btnN);
        btnO = view.findViewById(R.id.btnO);
        btnP = view.findViewById(R.id.btnP);
        btnQ = view.findViewById(R.id.btnQ);
        btnR = view.findViewById(R.id.btnR);
        btnS = view.findViewById(R.id.btnS);
        btnT = view.findViewById(R.id.btnT);
        btnU = view.findViewById(R.id.btnU);
        btnV = view.findViewById(R.id.btnV);
        btnW = view.findViewById(R.id.btnW);
        btnX = view.findViewById(R.id.btnX);
        btnY = view.findViewById(R.id.btnY);
        btnZ = view.findViewById(R.id.btnZ);











        switch (view.getId()) {
            case R.id.btnA:
                // Code for button 1 click

                btnA.setVisibility(View.INVISIBLE);
                buttonPressed.add("a");

                if (currentgame.indexOf('a') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('a');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("A");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnB:
                // Code for button 1 click

                btnB.setVisibility(View.INVISIBLE);
                buttonPressed.add("b");

                if (currentgame.indexOf('b') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('b');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("B");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");




                    receivingImage.wrongMove(game_state);


                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }





                }

                break;


            case R.id.btnC:
                // Code for button 1 click

                btnC.setVisibility(View.INVISIBLE);
                buttonPressed.add("c");

                if (currentgame.indexOf('c') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('c');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("C");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnD:
                // Code for button 1 click

                btnD.setVisibility(View.INVISIBLE);
                buttonPressed.add("d");

                if (currentgame.indexOf('d') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('d');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("D");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnE:
                // Code for button 1 click

                btnE.setVisibility(View.INVISIBLE);
                buttonPressed.add("e");

                if (currentgame.indexOf('e') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('e');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("E");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;


            case R.id.btnF:
                // Code for button 1 click

                btnF.setVisibility(View.INVISIBLE);
                buttonPressed.add("f");

                if (currentgame.indexOf('f') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('f');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("F");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);
                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnG:
                // Code for button 1 click

                btnG.setVisibility(View.INVISIBLE);
                buttonPressed.add("g");

                if (currentgame.indexOf('g') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('g');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("G");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        //btnRestart.setVisibility(View.VISIBLE);
                        receiving.btnRestartVisible();
                        buttonsProperty.disableAllButton();

                        if (game_state == 7){
                            buttonsProperty.disableAllButton();
                            receiving.btnRestartVisible();
                            makeAToast("You Lost");


                        }


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);




                }

                break;
            case R.id.btnH:
                // Code for button 1 click

                btnH.setVisibility(View.INVISIBLE);
                buttonPressed.add("h");

                if (currentgame.indexOf('h') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('h');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("H");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnI:
                // Code for button 1 click

                btnI.setVisibility(View.INVISIBLE);
                buttonPressed.add("i");

                if (currentgame.indexOf('i') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('i');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("I");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);
                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnJ:
                // Code for button 1 click

                btnJ.setVisibility(View.INVISIBLE);
                buttonPressed.add("j");

                if (currentgame.indexOf('j') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('j');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("J");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);
                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnK:
                // Code for button 1 click

                btnK.setVisibility(View.INVISIBLE);
                buttonPressed.add("k");

                if (currentgame.indexOf('k') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('k');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("K");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);
                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnL:
                // Code for button 1 click

                btnL.setVisibility(View.INVISIBLE);
                buttonPressed.add("l");

                if (currentgame.indexOf('l') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('l');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("L");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);
                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnM:
                // Code for button 1 click

                btnM.setVisibility(View.INVISIBLE);
                buttonPressed.add("m");

                if (currentgame.indexOf('m') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('m');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("M");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;

            case R.id.btnN:
                // Code for button 1 click

                btnN.setVisibility(View.INVISIBLE);
                buttonPressed.add("n");

                if (currentgame.indexOf('n') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('n');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("N");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnO:
                // Code for button 1 click

                btnO.setVisibility(View.INVISIBLE);
                buttonPressed.add("o");

                if (currentgame.indexOf('o') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('o');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("O");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnP:
                // Code for button 1 click

                btnP.setVisibility(View.INVISIBLE);
                buttonPressed.add("p");

                if (currentgame.indexOf('p') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('p');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("P");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();




                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnQ:
                // Code for button 1 click

                btnQ.setVisibility(View.INVISIBLE);
                buttonPressed.add("q");

                if (currentgame.indexOf('q') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('q');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("Q");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnR:
                // Code for button 1 click

                btnR.setVisibility(View.INVISIBLE);
                buttonPressed.add("r");

                if (currentgame.indexOf('r') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('r');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("R");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnS:
                // Code for button 1 click

                btnS.setVisibility(View.INVISIBLE);
                buttonPressed.add("s");

                if (currentgame.indexOf('s') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('s');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("S");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnT:
                // Code for button 1 click

                btnT.setVisibility(View.INVISIBLE);
                buttonPressed.add("t");

                if (currentgame.indexOf('t') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('t');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("T");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnU:
                // Code for button 1 click

                btnU.setVisibility(View.INVISIBLE);
                buttonPressed.add("u");

                if (currentgame.indexOf('u') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('u');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("U");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnV:
                // Code for button 1 click

                btnV.setVisibility(View.INVISIBLE);
                buttonPressed.add("v");

                if (currentgame.indexOf('v') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('v');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("V");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnW:
                // Code for button 1 click

                btnW.setVisibility(View.INVISIBLE);
                buttonPressed.add("w");

                if (currentgame.indexOf('w') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('w');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("W");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnX:
                // Code for button 1 click

                btnX.setVisibility(View.INVISIBLE);
                buttonPressed.add("x");

                if (currentgame.indexOf('x') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('x');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("X");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnY:
                // Code for button 1 click

                btnY.setVisibility(View.INVISIBLE);
                buttonPressed.add("y");

                if (currentgame.indexOf('y') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('y');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("Y");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
            case R.id.btnZ:
                // Code for button 1 click

                btnZ.setVisibility(View.INVISIBLE);
                buttonPressed.add("z");

                if (currentgame.indexOf('z') >= 0) {


                    ArrayList<Integer> answer = indexs_of_char('z');

                    solved = solved + answer.size();


                    for (int i = 0; i < (answer.size()); i++) {

                        EditText et = new EditText(this);

                        et = (EditText) findViewById(answer.get(i) + 1);

                        et.setText("Z");
                    }


                    if (solved == currentgame.length()) {

                        //you have solved the game show toast
                        // new word

                        makeAToast("You Won");
                        receiving.btnRestartVisible();
                        //btnRestart.setVisibility(View.VISIBLE);
                        buttonsProperty.disableAllButton();


                    }







                }

                else{
                    //load next  pic

                    //
                    game_state = game_state+1;
                    //buttonsProperty.disableAllButton();


                    //makeAToast("You Lost");
                    receivingImage.wrongMove(game_state);

                    if (game_state == 7){
                        buttonsProperty.disableAllButton();
                        receiving.btnRestartVisible();
                        makeAToast("You Lost");


                    }




                }

                break;
        }
    }


    @Override
    public void restartButton(View v){


        btnRestart = v.findViewById(R.id.btnRestart);

        BottomLeft receiving = (BottomLeft) getFragmentManager().findFragmentById(R.id.BottomLeft);
        Right receivingImage =  (Right) getFragmentManager().findFragmentById(R.id.Right);
        TopLeft buttonsProperty = (TopLeft) getFragmentManager().findFragmentById(R.id.TopLeft);

        gameNumber = gameNumber+1;

        //Log.i("hello","hello");

        if (gameNumber == games.length) {

            gameNumber = 0;


        }



        //textViewHint.setText(Hint[gameNumber]);

        receiving.setHint(Hint[gameNumber]);




        currentgame = games[gameNumber].toLowerCase();
        game_state =0 ;
        solved = 0 ;
        numberOfLines = currentgame.length();

        Log.i("NOL2",numberOfLines +"");
        removeLine(ll);
        Add_Line(numberOfLines,ll);
        btnRestart.setVisibility(View.INVISIBLE);
        receivingImage.setDefaultImage();
        //imageViewMain.setImageResource(R.drawable.step0);
        buttonsProperty.buttonVisible();
        makeAToast("Welcome To the New Game");
        buttonsProperty.enableAllButton();
        buttonPressed = new ArrayList<String>();


    }









    public void makeAToast(String message){


        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }


    public void buttonInvisibleForRestoreInstance(String value){


        switch (value){

            case "a":
                btnA.setVisibility(View.INVISIBLE);
                break;
            case "b":
                btnB.setVisibility(View.INVISIBLE);
                break;
            case "c":
                btnC.setVisibility(View.INVISIBLE);
                break;
            case "d":
                btnD.setVisibility(View.INVISIBLE);
                break;
            case "e":
                btnE.setVisibility(View.INVISIBLE);
                break;
            case "F":
                btnF.setVisibility(View.INVISIBLE);
                break;
            case "G":
                btnG.setVisibility(View.INVISIBLE);
                break;
            case "h":
                btnH.setVisibility(View.INVISIBLE);
                break;
            case "i":
                btnI.setVisibility(View.INVISIBLE);
                break;
            case "j":
                btnJ.setVisibility(View.INVISIBLE);
                break;
            case "k":
                btnK.setVisibility(View.INVISIBLE);
                break;
            case "l":
                btnL.setVisibility(View.INVISIBLE);
                break;
            case "m":
                btnM.setVisibility(View.INVISIBLE);
                break;
            case "n":
                btnN.setVisibility(View.INVISIBLE);
                break;
            case "o":
                btnO.setVisibility(View.INVISIBLE);
                break;
            case "p":
                btnP.setVisibility(View.INVISIBLE);
                break;
            case "q":
                btnQ.setVisibility(View.INVISIBLE);
                break;

            case "r":
                btnR.setVisibility(View.INVISIBLE);
                break;

            case "s":
                btnS.setVisibility(View.INVISIBLE);
                break;

            case "t":
                btnT.setVisibility(View.INVISIBLE);
                break;

            case "u":
                btnU.setVisibility(View.INVISIBLE);
                break;

            case "v":
                btnV.setVisibility(View.INVISIBLE);
                break;

            case "w":
                btnW.setVisibility(View.INVISIBLE);
                break;

            case "x":
                btnX.setVisibility(View.INVISIBLE);
                break;
            case "y":
                btnY.setVisibility(View.INVISIBLE);
                break;


            case "z":
                btnZ.setVisibility(View.INVISIBLE);
                break;



















        }








    }




    public ArrayList<Integer> indexs_of_char(char x){


        ArrayList<Integer> answer = new ArrayList<Integer>();

        int i;

        i = currentgame.indexOf(x);
        int j = 0;
        while(i >= 0) {
            answer.add(i);
            i = currentgame.indexOf(x , i+1);
            j++;
        }

        return answer;
    }


    public void removeLine(LinearLayout ll){

        //LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayoutEdit);
        ll.removeAllViews();


    }

    public void Add_Line(int length, LinearLayout ll) {

        //LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayoutEdit);

        ll.setOrientation(LinearLayout.HORIZONTAL);


        View vi = new View(this);

        ll.addView(vi, 150,20);





        for(int i=0; i<length; i++) {


            // add edittext
            EditText et = new EditText(this);
            //LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);


            et.setText("");

            et.setId(i + 1);

            et.setTextSize((float) 18.0);


            vi = new View(this);

            ll.addView(vi, 18,18);
            ll.addView(et);

            et.setFocusable(false);
            et.setClickable(false);



        }
    }







}
