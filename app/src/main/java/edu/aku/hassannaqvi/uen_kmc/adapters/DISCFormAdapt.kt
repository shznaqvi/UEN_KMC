package edu.aku.hassannaqvi.uen_kmc.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.aku.hassannaqvi.uen_kmc.databinding.EnmwraRowBinding
import edu.aku.hassannaqvi.uen_kmc.models.Form

class DISCFormAdapt(
    private val clickListener: FormListListener
) :
    ListAdapter<Form, DISCFormAdapt.ViewHolder>(FormDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener)
    }

    class ViewHolder private constructor(private val binding: EnmwraRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: Form,
            clickListener: FormListListener
        ) {
            binding.apply {
                this.item = item
                itemClickListener = clickListener
                executePendingBindings()
            }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = EnmwraRowBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

open class FormListListener(val clickListener: (form: Form) -> Unit) {
    fun onClick(formData: Form) = clickListener(formData)
}

class FormDiffCallback : DiffUtil.ItemCallback<Form>() {
    override fun areItemsTheSame(oldItem: Form, newItem: Form): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Form, newItem: Form): Boolean {
        return oldItem.uid == newItem.uid
    }
}