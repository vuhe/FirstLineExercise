package com.example.uibestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val msgList = ArrayList<Msg>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMsg()
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = MsgAdapter(msgList)
        recyclerView.adapter = adapter
        send.setOnClickListener {
            val content = inputText.text.toString()
            if (content.isNotEmpty()) {
                val msg = Msg(content, Msg.TYPE_SENT)
                msgList.add(msg)
                adapter.notifyItemInserted(msgList.size - 1)
                recyclerView.scrollToPosition(msgList.size - 1)
                inputText.setText("")
            }


        }
    }

    private fun initMsg() {
        val msg1 = Msg("Hello world.", Msg.TYPE_RECEIVED)
        val msg2 = Msg("Hello. Who are you?", Msg.TYPE_SENT)
        val msg3 = Msg("This is me. Nice to meet you.", Msg.TYPE_RECEIVED)
        msgList.apply {
            add(msg1)
            add(msg2)
            add(msg3)
        }
    }
}
