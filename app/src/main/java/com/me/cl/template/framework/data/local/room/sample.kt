//package com.me.cl.template.framework.data.local.room
//
//import android.arch.lifecycle.LiveData
//import android.arch.persistence.room.*
//import android.os.Parcel
//import android.os.Parcelable
//todo add room and remove sample code
//
//@Entity(tableName = "cities")
//data class City(
//        val city: String,
//        val growth_from_2000_to_2013: String,
//        val latitude: Double,
//        val longitude: Double,
//        val population: String,
//        val rank: String,
//        val state: String) : Parcelable {
//
//    @PrimaryKey(autoGenerate = true)
//    var uid:Int=0
//
//    constructor(parcel: Parcel) : this(
//            parcel.readString(),
//            parcel.readString(),
//            parcel.readDouble(),
//            parcel.readDouble(),
//            parcel.readString(),
//            parcel.readString(),
//            parcel.readString())
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(city)
//        parcel.writeString(growth_from_2000_to_2013)
//        parcel.writeDouble(latitude)
//        parcel.writeDouble(longitude)
//        parcel.writeString(population)
//        parcel.writeString(rank)
//        parcel.writeString(state)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<City> {
//        override fun createFromParcel(parcel: Parcel): City {
//            return City(parcel)
//        }
//
//        override fun newArray(size: Int): Array<City?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
//
//@Dao
//interface CityDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertCity(city: City)
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertCities(cities: List<City>)
//
//    @Update
//    fun updateCity(city: City): Int
//
//    @Update
//    fun updateCities(cities: List<City>): Int
//
//    @Update
//    fun updateCities(vararg users: City)
//
//    @Delete
//    fun deleteCity(city: City): Int
//
//    @Delete
//    fun deleteCities(cities: List<City>): Int
//
//    @Delete
//    fun deleteCities(vararg cities: City): Int
//
//    @Query("select * from cities")
//    fun getAll(): LiveData<List<City>>
//
//    @Query("select * from cities")
//    fun getCities(): LiveData<Array<City>>
//
//    @Query("delete from cities where city =:name")
//    fun removeCity(name: String)
//}
//
//
//@Database(entities= arrayOf(City::class),version=1)
//abstract class AppDatabase: RoomDatabase() {
//    abstract fun cityDao(): CityDao
////   companion object {
////      private lateinit var sInstance: AppDatabase
////      @JvmStatic
////      fun getInstance(context: Context): AppDatabase {
////         if (sInstance == null) {
////            synchronized(AppDatabase::class.java) {
////               if (sInstance == null) {
////                  sInstance = Room.databaseBuilder(context.applicationContext,
////                          AppDatabase::class.java, "material-tab").build()
////               }
////            }
////         }
////         return sInstance
////      }
////   }
//}