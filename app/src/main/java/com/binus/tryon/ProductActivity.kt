package com.binus.tryon

import ai.deepar.deepar_example.R
import ai.deepar.deepar_example.databinding.ActivityProductBinding
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import com.binus.tryon.adapter.GridSpacingItemDecoration
import com.binus.tryon.adapter.ProductListAdapter
import com.binus.tryon.entities.Product

class ProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductBinding
    private lateinit var adapter: ProductListAdapter
    private var page: String? = null
    private var spanCount = 3
    lateinit var productData: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val toolbar = findViewById<Toolbar>(R.id.custom_toolbar)
        setSupportActionBar(toolbar)

        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
            supportActionBar!!.title = ""
        }

        spanCount =
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) 5 else 3

        page = intent.getStringExtra(EXTRA_PAGE)

        initPage()
        initRecyclerView()
        initAdapter()
        initSearchView()

        binding.searchView.clearFocus()

    }

    private fun initPage(){
        when(page){
            "Brand" -> {
                binding.title.text = "Brands"
                binding.searchView.queryHint = "Search Brands"
                binding.heading.text = "Brand List"
            }
            "Product" -> {
                binding.title.text = "Products"
                binding.heading.text = "Top Products"
            }
            "Lip" -> {
                binding.title.text = "Lip Products"
                binding.heading.text = "Lip Products"
            }
            "Face" -> {
                binding.title.text = "Face Products"
                binding.heading.text = "Face Products"
            }
            "Eye" -> {
                binding.title.text = "Eye Products"
                binding.heading.text = "Eye Products"
            }
            else -> {
                binding.title.text = page
                binding.heading.visibility = View.GONE
            }
        }

    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = GridLayoutManager(this, spanCount)

        binding.recyclerView.addItemDecoration(
            GridSpacingItemDecoration(
                spanCount,
                20,
                false
            )
        )
        binding.recyclerView.itemAnimator = null
    }

    private fun initAdapter() {

        var isBrandProducts = false
        when(page){
            "Brand" -> { productData = DummyData.getLipProducts() }
            "Product" -> { productData = DummyData.getLipProducts() }
            "Lip" -> { productData = DummyData.getLipProducts() }
            "Face" -> { productData = DummyData.getLipProducts() }
            "Eye" -> { productData = DummyData.getLipProducts() }
            else -> {
                isBrandProducts = true
                productData = DummyData.getLipProducts()
            }
        }
        adapter = ProductListAdapter(productData, this, page == "Brand", isBrandProducts)
        setCallback(adapter)
        binding.recyclerView.adapter = adapter
    }

    private fun setCallback(adapter: ProductListAdapter) {
        adapter.setCallback(object : ProductListAdapter.Callback {
            override fun onItemClicked(data: Product) {
                if (page == "Brand"){
                    val intent = Intent(this@ProductActivity, ProductActivity::class.java)
                    Log.d("<TAG>", data.brand)
                    intent.putExtra(EXTRA_PAGE, data.brand)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this@ProductActivity, FilterPageActivity::class.java)
                    Log.d("<TAG>", data.toString())
                    intent.putExtra(FilterPageActivity.EXTRA_PRODUCT, data.id)
                    startActivity(intent)
                }
                
            }
        })
    }


    private fun initSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null && query.isNotEmpty()) {
                    val data = productData.filter{ p -> p.name.contains(query, true) || p.brand.contains(query, true) }
                    adapter.setListUsers(data)
                }
                binding.searchView.clearFocus()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()) {
                    adapter.setListUsers(productData)
                    return true
                }
                return false
            }

        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_PAGE = "extra_page"
    }
}