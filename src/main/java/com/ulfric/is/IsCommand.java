package com.ulfric.is;

import org.bukkit.entity.Player;

import com.ulfric.andrew.Command;
import com.ulfric.andrew.Context;
import com.ulfric.andrew.Permission;
import com.ulfric.andrew.argument.Argument;
import com.ulfric.commons.naming.Name;
import com.ulfric.i18n.content.Details;

@Name("is")
@Permission("is.use")
public class IsCommand implements Command {

	@Argument
	protected Player target;

	@Override
	public void run(Context context) {
		// TODO help menu
	}

	protected Details details() {
		Details details = new Details();
		details.add("target", target.getName());
		return details;
	}

}