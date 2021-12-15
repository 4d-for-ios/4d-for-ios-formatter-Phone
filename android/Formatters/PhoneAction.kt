package ___PACKAGE___

import android.content.Intent
import android.net.Uri
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("phoneAction")
fun phoneAction(view: TextView, phoneAction: String?) {
    if (phoneAction.isNullOrEmpty()) return

    view.setOnClickListener {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:$phoneAction")
        view.context.startActivity(dialIntent)
    }
}
