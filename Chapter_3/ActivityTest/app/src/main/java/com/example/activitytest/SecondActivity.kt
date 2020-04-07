package com.example.activitytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(R.layout.second_activity)
//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity", "extra is $extraData")
        button2.setOnClickListener {
//            val intent = Intent()
//            intent.putExtra("data_return", "Hello FirstActivity")
//            setResult(Activity.RESULT_OK, intent)
//            finish()
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
