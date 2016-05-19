package com.example.jagroto.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyExpandableAdapter adapter;
    ExpandableListView expandableListView;
    List<String>mainDataList;
    HashMap<String,List<String>>subDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView =(ExpandableListView)findViewById(R.id.expandablelistview);
        prepareListItem();
        adapter =new MyExpandableAdapter(this,mainDataList,subDataList);
        expandableListView.setAdapter(adapter);

    }

    private void prepareListItem(){
        mainDataList =new ArrayList<String>();
        subDataList =new HashMap<String, List<String>>();

        //Now Adding Main Data item

        mainDataList.add("Hollywood");
        mainDataList.add("Bollywood");
        mainDataList.add("Tollywood");
        mainDataList.add("Tallywood");
        mainDataList.add("Kolkata Bangla");
        mainDataList.add("Motivation Movie");
        mainDataList.add("Inspiration Movie");
        mainDataList.add("Romantic Movie");
        mainDataList.add("Action Movie");
        mainDataList.add("Top 10 Movie");

        //Now adding sub data

        List<String>holl=new ArrayList<>();
        holl.add("The Life is Beautyfull");
        holl.add("Sunrise");
        holl.add("Wild Seven");
        holl.add("Warner");
        holl.add("Avenges");
        holl.add("Jungle Book");
        holl.add("Single Life");
        holl.add("Boy Firend");
        holl.add("Fifty Shade of Gray");
        holl.add("Avenges");



        List<String>boll=new ArrayList<>();
        boll.add("Action Replay");
        boll.add("Welcome");
        boll.add("Three Edites");
        boll.add("Welcome 2");
        boll.add("Launch Box");
        boll.add("Bache Hasina");
        boll.add("Wanted");
        boll.add("Kick");
        boll.add("Dhoom two");
        boll.add("Doom Three");

        List<String>toll=new ArrayList<>();
        toll.add("Nirban");
        toll.add("Manuse");
        toll.add("Hate Story");
        toll.add("Three Kona");
        toll.add("Sate");
        toll.add("Shes Cite");
        toll.add("Abohoman");
        toll.add("Kagae Bou");
        toll.add("Sonia");
        toll.add("Four Day");


        List<String>tall=new ArrayList<>();
        tall.add("Son/Sathea 1");
        tall.add("Arian 2");
        tall.add("Arian 3");
        tall.add("Mirche 4");
        tall.add("Rebel 5");
        tall.add("Business 6");
        tall.add("Heard Attack 7");
        tall.add("Wrong Number 8");
        tall.add("Jungarehas 9");
        tall.add("Friend Of My 10");

        List<String>kol=new ArrayList<>();
        kol.add("Bindas 1");
        kol.add("Tuner Ma 2");
        kol.add("Buja na sa Buja na 3");
        kol.add("Amunash 4");
        kol.add("Pream Korce 5");
        kol.add("Kolling Ball 6");
        kol.add("Phoring 7");
        kol.add("Moringing 8");
        kol.add("Phoring 9");
        kol.add("Moringing 10");

        List<String>mot=new ArrayList<>();
        mot.add("Forest 1");
        mot.add("Forest 2");
        mot.add("Forest 3");
        mot.add("Forest 4");
        mot.add("Forest 5");
        mot.add("Forest 6");
        mot.add("Forest 7");
        mot.add("Forest 8");
        mot.add("Forest 9");
        mot.add("Forest 10");





        List<String>insp=new ArrayList<>();
        insp.add("Forest Gun 1");
        insp.add("Three Edites 2");
        insp.add("Roket Boy 3");
        insp.add("Lamess BOy 4");
        insp.add("Forest  5");
        insp.add("Fana 6");
        insp.add("Gugrate Boy 7");
        insp.add("Life Is change 8");
        insp.add("Forest Gun 9");
        insp.add("Three Edites 10");




        List<String>romn=new ArrayList<>();
        romn.add("Fifty Shade Of Gray 1");
        romn.add("Fifty Shade Of Gray 2");
        romn.add("Fifty Shade Of Gray 3");
        romn.add("Fifty Shade Of Gray 4");
        romn.add("Fifty Shade Of Gray 5");
        romn.add("Fifty Shade Of Gray 6");
        romn.add("Fifty Shade Of Gray 7");
        romn.add("Fifty Shade Of Gray 8");
        romn.add("Fifty Shade Of Gray 9");
        romn.add("Fifty Shade Of Gray 10");




        List<String>actn=new ArrayList<>();
        actn.add("America 1");
        actn.add("Anengers 2");
        actn.add("Widl Seven 3");
        actn.add("LOvely Match 4");
        actn.add("America 5");
        actn.add("Anengers 6");
        actn.add("Widl Seven 7");
        actn.add("LOvely Match 8");
        actn.add("America 9");
        actn.add("Anengers 10");




        List<String>to10=new ArrayList<>();

        to10.add("How to 1");
        to10.add("How to 2");
        to10.add("How to 3");
        to10.add("How to 4");
        to10.add("How to 5");
        to10.add("How to 6");
        to10.add("How to 7");
        to10.add("How to 8");
        to10.add("How to 9");
        to10.add("How to 10");


        subDataList.put(mainDataList.get(0),holl);
        subDataList.put(mainDataList.get(1),boll);
        subDataList.put(mainDataList.get(2),toll);
        subDataList.put(mainDataList.get(3),tall);
        subDataList.put(mainDataList.get(4),kol);
        subDataList.put(mainDataList.get(5),mot);
        subDataList.put(mainDataList.get(6),insp);
        subDataList.put(mainDataList.get(7),romn);
        subDataList.put(mainDataList.get(8),actn);
        subDataList.put(mainDataList.get(9),to10);




    }
}
