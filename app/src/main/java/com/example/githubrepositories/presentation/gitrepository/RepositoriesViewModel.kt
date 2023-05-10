package com.example.githubrepositories.presentation.gitrepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubrepositories.data.remote.response.RepositoriesResponse
import com.example.githubrepositories.data.repository.Repository
import com.example.githubrepositories.domain.model.RepositoriesModel
import kotlinx.coroutines.launch

class RepositoriesViewModel : ViewModel() {

    private val repository = Repository()

    private val resultMutableLiveData: MutableLiveData<RepositoriesModel> = MutableLiveData()
    val resultLiveData: LiveData<RepositoriesModel> = resultMutableLiveData

    fun getAllRepositories(ling:String, pag: Int) {
        viewModelScope.launch {
            val result = repository.getAllRepositories(language = ling, sort = "stars", page = pag)
            resultMutableLiveData.postValue(result)
        }
    }
}