package com.safi.keyboard
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.widget.*
class SettingsActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
  val root=LinearLayout(this).apply { orientation=1; gravity=Gravity.CENTER; setPadding(28,32,28,32); setBackgroundColor(0xFF101820.toInt()) }
  root.addView(TextView(this).apply { text="Safi Keyboard"; textSize=30f; setTextColor(-1); gravity=Gravity.CENTER })
  root.addView(TextView(this).apply { text="Premium Bengali + English keyboard"; textSize=15f; setTextColor(0xFFB7C8D1.toInt()); gravity=Gravity.CENTER; setPadding(0,8,0,28) })
  root.addView(Button(this).apply { text="1. Enable keyboard"; setOnClickListener { startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)) } })
  root.addView(Button(this).apply { text="2. Select Safi Keyboard"; setOnClickListener { (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showInputMethodPicker() } })
  root.addView(TextView(this).apply { text="Privacy-first starter. No keystroke analytics."; setTextColor(0xFFB7C8D1.toInt()); gravity=Gravity.CENTER; setPadding(8,24,8,0) })
  setContentView(root)
 }
}