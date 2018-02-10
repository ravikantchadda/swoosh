package com.development.swoosh.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.development.swoosh.R
import com.development.swoosh.Utilities.EXTRA_LEAGUE
import com.development.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill near you...."


    }
}
