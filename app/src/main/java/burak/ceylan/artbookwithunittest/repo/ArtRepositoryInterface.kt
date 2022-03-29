package burak.ceylan.artbookwithunittest.repo

import androidx.lifecycle.LiveData
import burak.ceylan.artbookwithunittest.model.ImageResponse
import burak.ceylan.artbookwithunittest.roomdb.Art
import burak.ceylan.artbookwithunittest.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}