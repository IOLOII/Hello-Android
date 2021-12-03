package com.example.android_try_21

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*


// 勾选Generate Layout File表示会自动为FirstActivity创建一个对应的布局文件，
// 勾选Launcher Activity表示会自动将FirstActivity设置为当前项目的主Activity。
// 最好每一个Activity都能对应一个布局。布局是用来显示界面内容的，我们现在就来手动创建一个布局文件。
class FirstActivity : BaseActivity() {
//    调用了父类的onCreate()方法。当然这只是默认的实现
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FirstActivity",this.toString())
//        调用了setContentView()方法来给当前的Activity加载一个布局，而在setContentView()方法中，我们一般会传入一个布局文件的id
//        只需要调用R.layout.first_layout就可以得到first_layout.xml布局的id
//        所有的Activity都要在AndroidManifest.xml中进行注册才能生效。
        setContentView(R.layout.first_layout)
        val button1:Button = findViewById(R.id.button1)
        button1.setOnClickListener {
//            Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)

            var intent = Intent(this,FirstActivity::class.java)
            startActivity(intent)

//            val data = "Hello SecondActivity"
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("extra_data", data)
//            startActivity(intent)

//            val intent = Intent(this, SecondActivity::class.java)
//            返回数据给上一层
//            startActivityForResult(intent, 1)




//            val intent = Intent("com.example.android_try_21.ACTION_START")
//            intent.addCategory("com.example.android_try_21.MY_CATEGORY")
//            startActivity(intent)

        }
        button.setOnClickListener {
//            finish()
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.baidu.com")
//            startActivity(intent)

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:10086")
            startActivity(intent)


        }
        buttonTest.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        第一个参数用于指定我们通过哪一个资源文件来创建菜单，这里当然是传入R.menu.main；第二个参数用于指定我们的菜单项将添加到哪一个Menu对象当中，这里直接使用onCreateOptionsMenu()方法中传入的menu参数
        menuInflater.inflate(R.menu.main,menu)
//        最后给这个方法返回true，表示允许创建的菜单显示出来，如果返回了false，创建的菜单将无法显示。
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this, "you click add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "you click remove", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstActivity", "returned data is $returnedData")
            }
        }
    }
}