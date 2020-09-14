package com.example.bikes

//20344 Jose Fernando Gonzalez Anavia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.bikesview.view.*

class MainAdapter(bikeStationClass: bikeStationClass): RecyclerView.Adapter<CustomViewHolderClass>(){

    val bikeNumbers  = listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16")
    val bikeNames  = listOf("smithfield","Parnell","Clommel","stStephen","dublinPort","howth","drumcondra","botanicGarden","phoenixPark","drimnagh","dublinCastle","guinnessStoreHouse","dublinia","clontarf","santryPark","airport")
    val bikeAddreesses  = listOf("57 Smithfield, Arbour Hill, Dublin, D07 F6HV Arbour Hill Dublin Ireland","31/32 Parnell Square West, Arbour Hill, Dublin, D01 YR92 Arbour Hill Dublin Ireland","1 Clonmel Street, Cathal Brugha Barracks, Dublin, D02 NX65 Cathal Brugha Barracks Dublin Ireland","112-114 Saint Stephen's Green, Cathal Brugha Barracks, Dublin, D02 TD28 Cathal Brugha Barracks Dublin Ireland","Number 2 Branch Road North, Dublin Port, North Dock, North Dock B ED, Dublin 1, Dublin, County Dublin, Leinster, D03 W2T9, Ireland","St Fintan's Crescent, Sutton South, Howth ED, Dublin 13, Fingal, County Dublin, Leinster, D13 TC04, Ireland","Batchelors, Bannow Road, Grangegorman North, Cabra West B ED, Dublin 7, Dublin, County Dublin, Leinster, D07 X9YN, Ireland","The National Botanic Gardens of Ireland, Botanic Road, Gooseacre, Botanic A ED, Dublin 9, Dublin, County Dublin, Leinster, D09 VY63, Ireland","Stewarts Care, Mill Lane, Palmerston Lower, Palmerston ED, Dublin 20, South Dublin, County Dublin, Leinster, D20 DC99, Ireland","Western Parkway Motorway, Gallanstown, Clondalkin-Moorfield ED, Dublin 22, South Dublin, County Dublin, Leinster, D12 PK44, Ireland","Southgate, Cork Street, Merchants Quay C ED, Dublin 8, Dublin, County Dublin, Leinster, D08 XH90, Ireland","503, South Circular Road, Goldenbridge North, Ushers F ED, Dublin 8, Dublin, County Dublin, Leinster, D08 EP8E, Ireland","t. Catherine's Community Sports Centre, Marrowbone Lane, Ushers C ED, Dublin 8, Dublin, County Dublin, Leinster, D08 X4Y8, Ireland","Ardscoil Rís, Malahide Road, Donnycarney, Clontarf West C ED, Dublin 3, Dublin, County Dublin, Leinster, D05 Y4T8, Ireland","Knowth Court, Balcurris, Ballymun B ED, Dublin 11, Dublin, County Dublin, Leinster, D09 C8P5, Ireland","West Apron, Old Naul Road, Huntstown, Airport ED, Fingal, County Dublin, Leinster, K67 A5W6, Ireland")

    override fun getItemCount(): Int {
        return bikeNumbers.count()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolderClass {
            val layoutInflater = LayoutInflater.from(parent.context)
            val cellForRow = layoutInflater.inflate(R.layout.bikesview,parent,false)
        return CustomViewHolderClass(cellForRow)
    }


    override fun onBindViewHolder(holder: CustomViewHolderClass, position: Int) {

        val bikeNumberList = bikeNumbers.get(position)
        val bikeNameList = bikeNames.get(position)
        val bikeAddressList = bikeAddreesses.get(position)

        holder.view.bike_station_number.text = bikeNumberList
        holder.view.bike_Station_Name.text = bikeNameList
        holder.view.bike_Station_Address.text = bikeAddressList
    }
}

class CustomViewHolderClass(val view: View): RecyclerView.ViewHolder (view){

}