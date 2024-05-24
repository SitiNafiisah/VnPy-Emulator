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

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.abiddarris.renpyemulator.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class AddNewGameDialog extends BaseDialogFragment {
    
    @Override
    protected MaterialAlertDialogBuilder createDialog() {
        return super.createDialog()
            .setTitle(R.string.add_new_game);
    }
    
    @Override
    public View createView() {
        return getLayoutInflater().inflate(
            R.layout.add_new_game_layout, null);
    }
    
}
