package com.example.liveapitest


import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apicall.databinding.CustomListBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: CustomListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CustomListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
    }

    private fun getData(): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Loading...")
        progressDialog.show()

        retrofitinstance.apiinterface.getData("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiI3OCIsIkN1cnJlbnRDb21JZCI6IjEiLCJuYmYiOjE2ODE1Mzc0OTQsImV4cCI6MTY4MjE0MjI5NCwiaWF0IjoxNjgxNTM3NDk0fQ.cGrvpfUQg-qlQI5TSNtLQ79tm9eKfkwH3l_zhEPFLAc").enqueue(object : Callback<ResponseDataClass?> {
            override fun onResponse(
                call: Call<ResponseDataClass?>,
                response: Response<ResponseDataClass?>
            ){
                val productList = response.body()?.ProductList
                if (productList != null) {
                    for (product in productList) {
                        val name = product.Name
                        binding.Name.append("Name: $name\n")
                        val price = product.Price
                        binding.Price.append("Price: "+price.toString() +"Tk" +"\n")
                        val old_price = product.OldPrice
                        binding.Price.append("Old Price: "+old_price.toString() +"Tk" +"\n")
                    }
                }
                progressDialog.dismiss()
            }

            override fun onFailure(call: Call<ResponseDataClass?>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.localizedMessage}", Toast.LENGTH_SHORT).show()
                progressDialog.dismiss()
            }
        })
    return arrayList
    }
}


