package com.example.hw3_tablelayout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnAdd: Button
    private lateinit var inptWater: EditText
    private lateinit var inptLocation: EditText
    private lateinit var inptType: EditText
    private lateinit var myTableLayout: TableLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Important find inputs, btns after layout creation
        btnAdd = findViewById(R.id.btnAdd)
        inptWater = findViewById(R.id.inptWater)
        inptLocation = findViewById(R.id.inptLocation)
        inptType = findViewById(R.id.inptType)
        myTableLayout = findViewById(R.id.myTableLayout)
    }

    fun handleAddRowClick(view: View) {
        // create new table row
        val row = TableRow(this)
        row.layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT)

        val col1 = TextView(this)
        col1.text=inptWater.text
        col1.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.WRAP_CONTENT,
            TableRow.LayoutParams.WRAP_CONTENT,1f)

        val col2 = TextView(this)
        col2.text=inptLocation.text
        col2.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.WRAP_CONTENT,
            TableRow.LayoutParams.WRAP_CONTENT,1f)

        val col3 = TextView(this)
        col3.text=inptType.text
        col3.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.WRAP_CONTENT,
            TableRow.LayoutParams.WRAP_CONTENT,1f)


        row.addView(col1)
        row.addView(col2)
        row.addView(col3)
        myTableLayout.addView(row)
    }
}