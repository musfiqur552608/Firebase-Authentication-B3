package org.freedu.authentication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import org.freedu.authentication.databinding.ActivityHomeBinding
import org.freedu.authentication.databinding.ActivityLoginBinding
import org.freedu.authentication.viewmodels.AuthViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var viewModel: AuthViewModel
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.logoutBtn.setOnClickListener {
            viewModel.signout()
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}