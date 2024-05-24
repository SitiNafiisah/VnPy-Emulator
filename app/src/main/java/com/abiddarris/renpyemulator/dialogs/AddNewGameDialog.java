/***********************************************************************************
 * Copyright (C) 2024 Abiddarris
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 ***********************************************************************************/
package com.abiddarris.renpyemulator.dialogs;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.abiddarris.renpyemulator.R;
import com.abiddarris.renpyemulator.databinding.AddNewGameLayoutBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.io.File;

public class AddNewGameDialog extends BaseDialogFragment {
    
    @Override
    protected MaterialAlertDialogBuilder createDialog() {
        return super.createDialog()
            .setTitle(R.string.add_new_game)
            .setNegativeButton(android.R.string.cancel, (d,w) -> {})
            .setPositiveButton(android.R.string.ok, (d,w) -> {});
    }
    
    @Override
    public View createView() {
        AddNewGameLayoutBinding binding = AddNewGameLayoutBinding.inflate(getLayoutInflater());
        binding.pathEditText.addOnEditTextAttachedListener(v -> v.getEditText().setText(getDefaultLocation()));
        
        return binding.getRoot();
    }
  
    @SuppressWarnings("deprecation")
    private String getDefaultLocation() {
    	Context context = getContext();
        File[] files = null;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R && "samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            files = context.getExternalMediaDirs();
            
            for(var file : files) {
                if(file != null) {
                    return file.getAbsolutePath();
                }
            }
        } 
        
        File file = context.getExternalFilesDir(null);
        return file == null ? "" : file.getAbsolutePath();
    }
    
}
