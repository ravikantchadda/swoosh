package com.development.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leagueNextClicked.setOnClickListener {
            val skillActivity = Intent(this,SkillActivity::class.java)
            startActivity(skillActivity)

        }
    }
}
