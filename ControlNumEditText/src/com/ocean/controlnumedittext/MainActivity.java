package com.ocean.controlnumedittext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.ocean.controlnumedittext.ControlNumEditText.onTextEditListener;

public class MainActivity extends Activity {

	private ControlNumEditText edit;
	private TextView tv_show;
	private int MAX_NUM = 20;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myedittext);
		
		edit = (ControlNumEditText) findViewById(R.id.et);
		tv_show = (TextView) findViewById(R.id.tv_show);
		//����������������ֻ��Ҫ����һ�����У���Ϊ��������������֪��һ����������ֵ��
		//You just need to write one of these two method below.Because you need to know the max number.
		edit.setMaxNum(MAX_NUM);
		MAX_NUM = edit.getMaxNum();
		
		edit.setOnTextEditListener(new onTextEditListener() {
			
			@Override
			public void textChanged(int cur_num) {
				tv_show.setText(String.valueOf((MAX_NUM-cur_num)));
			}
		});
	}

}
