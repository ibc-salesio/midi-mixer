package com.example.miditest;


import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.miditest.R.id;

public class auxclick_Activity extends Activity{

	    
	    @Override
	    public void onCreate(Bundle savedInstanceState) {//開いたら

	        final setting_class st= new setting_class();
	        final network nw = new network();

	        //midiで情報を取ってくるプログラム(予定)
	       for (int i=0;i<16;i++){//とりあえず初期化
	            st.on_c[i]=0;
	            st.solo_c[i]=0;
	            st.vol_db[i]=0;
	            i++;
	        }
	        //ここまで

	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.mainclick_activity);
	        nw.socket_make();


	        //トグルスイッチ
	        final ToggleButton on_off = (ToggleButton) findViewById(R.id.toggleButton1);
	        final ToggleButton solo = (ToggleButton) findViewById(R.id.toggleButton2);

	        on_off.setOnCheckedChangeListener(new OnCheckedChangeListener() {//変更がなされたとき
	            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked1) {
	                if(isChecked1==true){
	                    st.on_c[st.ach_set]=1;
	                    try {
							nw.send_packet("CHon"+(st.ach_set+1)+"\n"+st.on_c[st.ach_set]);
						} catch (IOException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
	                    
	                }else{
	                    st.on_c[st.ach_set]=0;
	                    try {
							nw.send_packet("CHon"+(st.ach_set+1)+"\n"+st.on_c[st.ach_set]);
						} catch (IOException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
	                }
	            }
	        });

	        solo.setOnCheckedChangeListener(new OnCheckedChangeListener() {//変更がなされたとき
	            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked2) {
	                if(isChecked2==true){
	                    st.solo_c[st.ach_set]=1;
	                    try {
							nw.send_packet("CHsolo"+(st.ach_set+1)+"\n"+st.solo_c[st.ach_set]);
						} catch (IOException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
	                }else{
	                    st.solo_c[st.ach_set]=0;
	                    try {
							nw.send_packet("CHsolo"+(st.ach_set+1)+"\n"+st.solo_c[st.ach_set]);
						} catch (IOException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
	                }

	            }
	        });
	      //トグルスイッチここまで

	        //シークバー周り
	        final SeekBar vol1 = (SeekBar)findViewById(R.id.seekBar1);
	        final TextView dBvol1 = (TextView) findViewById(id.dB_vol1);//動かすと強制終了する．

	        vol1.setMax(1023);
	        vol1.setProgress(0);
	        dBvol1.setText(String.valueOf(st.dblevel[0])+"dB");
	        vol1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
	            @Override
	            public void onProgressChanged(SeekBar vol1, int progress, boolean fromUser) {
	                int tmp=Integer.parseInt(String.valueOf(progress));
	                dBvol1.setText(String.valueOf(st.dblevel[tmp])+"dB");
	                //st.vol_db[st.ach_set]=tmp;//保存
	                try {
						nw.send_packet("CHdb"+(st.ach_set+1)+"\n"+String.valueOf(progress));
					} catch (IOException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
	            }
	            @Override
	            public void onStartTrackingTouch(SeekBar vol1) {
	                int tmp2=Integer.parseInt(String.valueOf(vol1.getProgress()));
	               dBvol1.setText(String.valueOf(st.dblevel[tmp2])+"dB");

	            }
	            @Override
	            public void onStopTrackingTouch(SeekBar vol1) {
	                int tmp2=Integer.parseInt(String.valueOf(vol1.getProgress()));
	                dBvol1.setText(String.valueOf(st.dblevel[tmp2])+"dB");

	            }

	        });
	        //ここまでシークバー

	        //選択の所
	        final TextView ch_v = (TextView) findViewById(id.ch_v);
	        Spinner chSpinner = (Spinner)findViewById(R.id.ch_select);
	        chSpinner.setOnItemSelectedListener(new OnItemSelectedListener(){
	            @Override//選択されたとき
	            public void onItemSelected(AdapterView parent, View arg1,int arg2, long arg3) {
	                Spinner chspinner = (Spinner)parent;
	                String item = (String)chspinner.getSelectedItem();
	                int item_int=Integer.parseInt(item);
	                //番号選択したときの処理 配列処理
	                switch (item_int) {
	                case 1:st.ach_set=0;break;case 2:st.ach_set=1;break;case 3:st.ach_set=2;break;case 4:st.ach_set=3;break;
	                case 5:st.ach_set=4;break;case 6:st.ach_set=5;break;case 7:st.ach_set=6;break;case 8:st.ach_set=7;break;
	                case 9:st.ach_set=8;break;case 10:st.ach_set=9;break;case 11:st.ach_set=10;break;case 12:st.ach_set=11;break;
	                case 13:st.ach_set=12;break;case 14:st.ach_set=13;break;case 15:st.ach_set=14;break;case 16:st.ach_set=15;break;
	                default: break;
	                }
	                //結果
	                ch_v.setText("CH"+(st.ach_set+1));//文字設定
	                vol1.setProgress(st.vol_db[st.ach_set]);
	                dBvol1.setText(String.valueOf(st.dblevel[st.vol_db[st.ach_set]])+"dB");
	                if(st.on_c[st.ach_set]==1){
	                    on_off.setChecked(true);
	                }else{
	                    on_off.setChecked(false);
	                }
	                if(st.solo_c[st.ach_set]==1){
	                    solo.setChecked(true);
	                }else{
	                    solo.setChecked(false);
	                }

	            }

	            @Override//されないとき
	            public void onNothingSelected(AdapterView<?> arg0) {}

	        });
	        //ここまで選択の所


	        //リセットボタン
	        Button r = (Button)findViewById(R.id.button2);
	        final AlertDialog.Builder resetDialog=new AlertDialog.Builder(this);
	        r.setOnClickListener(new View.OnClickListener(){
	            @Override
	            public void onClick(View v) {
	                resetDialog.setTitle("リセット");
	                resetDialog.setMessage("Mainフェーダの設定がリセットされますがよろしいですか？");
	                resetDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) {
	                        for (int i=0;i<16;i++){//とりあえず初期化
	                            st.on_c[i]=0;
	                            st.solo_c[i]=0;
	                            st.vol_db[i]=0;
	                            try {
									nw.send_packet("CHon"+i+"\n"+st.on_c[i]);
									nw.send_packet("CHdb"+i+"\n"+st.vol_db[i]);
									//Thread.sleep(0);
								} catch (IOException e) {
									// TODO 自動生成された catch ブロック
									e.printStackTrace();
								}
	                       
	                            }
	                        //結果
	                        st.ach_set=0;
	                        ch_v.setText("CH"+(st.ach_set+1));//文字設定
	                        vol1.setProgress(st.vol_db[st.ach_set]);
	                        dBvol1.setText(String.valueOf(st.dblevel[st.vol_db[st.ach_set]])+"dB");
	                        if(st.on_c[st.ach_set]==1){
	                            on_off.setChecked(true);
	                        }else{
	                            on_off.setChecked(false);
	                        }

	                        //結果
	                        }
	                });
	                resetDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) {
	                        // NGボタン押下時の処理
	                    }
	                });
	                resetDialog.show();

	            }

	        });//リセットボタンここまで
	        

	        //更新ボタン
	        Button k = (Button)findViewById(R.id.button1);
	        final AlertDialog.Builder koushinDialog=new AlertDialog.Builder(this);
	        k.setOnClickListener(new View.OnClickListener(){
	            @Override
	            public void onClick(View v) {
	                koushinDialog.setTitle("更新");
	                koushinDialog.setMessage("AUXフェーダの設定を更新しますか？");
	                koushinDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) {

	                    }
	                });
	                koushinDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) {
	                    		nw.halt_packet();
	                    }
	                });
	                koushinDialog.show();

	            }

	        });//更新ボタンここまで
	        



	        }

	    }