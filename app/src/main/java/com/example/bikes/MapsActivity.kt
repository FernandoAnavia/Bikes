package com.example.bikes

//20344 Jose Fernando Gonzalez Anavia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val actionbar = supportActionBar

        actionbar!!.title = "           MAP"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Dublin and move the camera
        val dublin = LatLng(53.3581716, -6.2595678)
        var mainMarker = mMap.addMarker(MarkerOptions().position(dublin).title("Marker in Dublin"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dublin,10.6f))
        mainMarker.isVisible = false


        addMarkers()

    }




    fun addMarkers (){

        val smithfield = LatLng(53.349562, -6.278198)
        var marker1 = mMap.addMarker(MarkerOptions().position(smithfield).title("Station in smithfield"))
        marker1.setTag(1)

        val Parnell = LatLng(53.353462, -6.265305)
        var marker2 = mMap.addMarker(MarkerOptions().position(Parnell).title("Station in Parnell"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Parnell,11f))
        marker2.setTag(2)

        val Clommel = LatLng(53.336021, -6.26298)
        var marker3 = mMap.addMarker(MarkerOptions().position(Clommel).title("Station in Clommel"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Clommel,11f))
        marker3.setTag(3)

        val stStephen = LatLng(53.337917, -6.262109)
        var marker4 = mMap.addMarker(MarkerOptions().position(stStephen).title("Station in stStephen"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stStephen,11f))
        marker4.setTag(4)

        val dublinPort = LatLng(53.351412, -6.208771)
        var marker5 = mMap.addMarker(MarkerOptions().position(dublinPort).title("Station in dublinPort"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dublinPort,11f))
        marker5.setTag(5)

        val howth = LatLng(53.377656, -6.095525)
        var marker6 = mMap.addMarker(MarkerOptions().position(howth).title("Station in howth"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(howth,11f))
        marker6.setTag(6)

        val drumcondra = LatLng(53.367899, -6.289875)
        var marker7 = mMap.addMarker(MarkerOptions().position(drumcondra).title("Station in drumcondra"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(drumcondra,11f))
        marker7.setTag(7)

        val botanicGarden = LatLng(53.372551, -6.271906)
        var marker8 = mMap.addMarker(MarkerOptions().position(botanicGarden).title("Station in botanicGarden"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(botanicGarden,11f))
        marker8.setTag(8)

        val phoenixPark = LatLng(53.355879, -6.364817)
        var marker9 = mMap.addMarker(MarkerOptions().position(phoenixPark).title("Station in phoenixPark"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(phoenixPark,11f))
        marker9.setTag(9)

        val drimnagh = LatLng(53.328786, -6.377738)
        var marker10 = mMap.addMarker(MarkerOptions().position(drimnagh).title("Station in drimnagh"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(drimnagh,11f))
        marker10.setTag(10)

        val dublinCastle = LatLng(53.342657, -6.280268)
        var marker11 = mMap.addMarker(MarkerOptions().position(dublinCastle).title("Station in dublinCastle"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dublinCastle,11f))
        marker11.setTag(11)

        val guinnessStoreHouse = LatLng(53.338110, -6.299954)
        var marker12 = mMap.addMarker(MarkerOptions().position(guinnessStoreHouse).title("Station in guinnessStoreHouse"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(guinnessStoreHouse,11f))
        marker12.setTag(12)

        val dublinia = LatLng(53.338787, -6.286749)
        var marker13 = mMap.addMarker(MarkerOptions().position(dublinia).title("Station in dublinia"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dublinia,11f))
        marker13.setTag(13)

        val clontarf = LatLng(53.369395, -6.227447)
        var marker14 = mMap.addMarker(MarkerOptions().position(clontarf).title("Station in clontarf"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clontarf,11f))
        marker14.setTag(14)

        val santryPark = LatLng(53.400127, -6.274823)
        var marker15 = mMap.addMarker(MarkerOptions().position(santryPark).title("Station in santryPark"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santryPark,11f))
        marker15.setTag(15)

        val airport = LatLng(53.424995, -6.25639)
        var marker16 = mMap.addMarker(MarkerOptions().position(airport).title("Station in airport"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(airport,11f))
        marker16.setTag(16)

    }

    fun setMarkerListeners() {
        mMap.setOnMarkerClickListener { marker -> Log.i(getString(R.string.MAPLOGGING),getString(R.string.MARKERCLICKED))

          Log.i(
              getString(R.string.MAPLOGGING),
              "Marker id (tag) is " + marker.getTag().toString()
          )
            true
        }

    }




}
