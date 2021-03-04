
//author @rdrizalnugraha
package id.kotlin.profilerizal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ContactFragment : Fragment() {
    override fun onCreateView(infalter: LayoutInflater, container: ViewGroup?, SavedInstanceState: Bundle?): View? {
        return LayoutInflater.from(mainActiviy).inflate(R.layout.fragment_contact, container,false)
    }
    companion object{
        lateinit var mainActiviy: MainActivity
        fun newInstance(activity:MainActivity): ContactFragment{
            mainActiviy = activity
            return  ContactFragment()
        }
    }
}

