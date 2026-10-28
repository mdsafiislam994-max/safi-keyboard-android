package com.safi.keyboard
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.widget.Toast
class VoiceInputActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
  try { val i=Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
   putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
   putExtra(RecognizerIntent.EXTRA_LANGUAGE,"bn-BD"); putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE,"bn-BD")
   putExtra(RecognizerIntent.EXTRA_PROMPT,"বাংলা বা English বলুন"); putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,3)
  }; startActivityForResult(i,4802) } catch (_:Exception) { Toast.makeText(this,"Speech Recognition unavailable",Toast.LENGTH_LONG).show(); finish() }
 }
 @Deprecated("Kept for broad Android compatibility")
 override fun onActivityResult(requestCode:Int,resultCode:Int,data:Intent?) { super.onActivityResult(requestCode,resultCode,data)
  if(requestCode==4802 && resultCode==RESULT_OK) data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)?.firstOrNull()?.let { SafiImeService.insertVoiceResult(it) }; finish()
 }
}