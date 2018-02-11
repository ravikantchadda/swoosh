package com.development.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.development.swoosh.Model.Player
import com.development.swoosh.R
import com.development.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            if (savedInstanceState != null) try {
                player = savedInstanceState?.getParcelable(EXTRA_PLAYER)

            }catch (e:Exception){
                println(e)
            }
        }
    }

    fun onBeginnerClicked(view:View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginnner"

    }

    fun onBallerClicked(view:View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"


    }

    fun onFinishedClicked(view:View) {

        if (player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill.", Toast.LENGTH_SHORT).show()
        }


    }
}
