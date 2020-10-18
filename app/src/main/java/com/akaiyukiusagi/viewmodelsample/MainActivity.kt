package com.akaiyukiusagi.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: SampleViewModel by viewModels() // ViewModelのインスタンスを作成
        var activityVariable: Int = 0 // Activityに保存する変数

        // 画面作成時に表示
        textActivity.text =  activityVariable.toString() // Activity
        textViewModel.text = viewModel.viewModelVariable.toString() // ViewModel

        // ボタンを押したら+1する
        button.setOnClickListener {
            // 変数に+1
            activityVariable++
            viewModel.viewModelVariable++

            // 表示
            textActivity.text =  activityVariable.toString()
            textViewModel.text = viewModel.viewModelVariable.toString()
        }
    }
}