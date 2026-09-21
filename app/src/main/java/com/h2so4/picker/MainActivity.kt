package com.h2so4.picker
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
class MainActivity : AppCompatActivity()
{
    private var choice: TextView? = null
    private var input: TextView? = null
    private var addButton: Button? = null
    private var removeButton: Button? = null
    private var showButton: Button? = null
    private var pickButton: Button? = null
    private val options: MutableList<String> = mutableListOf()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set()
    }
    fun set()
    {
        choice = findViewById(R.id.choice)
        input = findViewById(R.id.input)
        addButton = findViewById(R.id.addButton)
        addButton?.setOnClickListener()
        {
            if(!input?.text?.isBlank()!!)
            {
                var found: Boolean = false
                for(i in 0..options.size-1) if(input?.text.toString() == options.get(i)) found = true
                if(!found)
                {
                    options.add(input?.text.toString())
                    Toast.makeText(this, "${input?.text} was added to the options.", Toast.LENGTH_SHORT).show()
                    input?.text = ""
                }
                else Toast.makeText(this, "${input?.text} is an already existing option.", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "Please enter an option.", Toast.LENGTH_SHORT).show()
        }
        removeButton = findViewById(R.id.removeButton)
        removeButton?.setOnClickListener()
        {
            if(options.size > 0)
            {
                Toast.makeText(this, "The last option \"${options.get(options.size-1)}\" was removed.", Toast.LENGTH_SHORT).show()
                options.removeAt(options.size-1)
            }
            else Toast.makeText(this, "The options list is empty.", Toast.LENGTH_SHORT).show()
            choice?.text = "My Choice"
        }
        removeButton?.setOnLongClickListener()
        {
            if(options.size > 0)
            {
                options.clear()
                Toast.makeText(this, "The options list was cleared.", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "The options list is empty.", Toast.LENGTH_SHORT).show()
            choice?.text = "My Choice"
            true
        }
        showButton = findViewById(R.id.showButton)
        showButton?.setOnClickListener()
        {
            if(options.size > 0)
            {
                var show: String = "Options Lits:\n"
                for(i in 0..options.size-1) show = "$show\n${i+1}- ${options.get(i)}."
                Toast.makeText(this, show, Toast.LENGTH_LONG).show()
            }
            else Toast.makeText(this, "The options list is empty.", Toast.LENGTH_SHORT).show()
        }
        pickButton = findViewById(R.id.pickButton)
        pickButton?.setOnClickListener()
        {
            if(options.size > 0)
            {
                choice?.text = options.get(Random.nextInt(0, options.size))
                options.clear()
                Toast.makeText(this, "I hope you are satisfied with the choice.", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "Please enter options first.", Toast.LENGTH_SHORT).show()
        }
    }
}