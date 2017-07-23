package com.ulfric.is;

import org.bukkit.entity.Player;

import com.ulfric.andrew.Command;
import com.ulfric.andrew.Context;
import com.ulfric.andrew.Permission;
import com.ulfric.andrew.argument.Argument;
import com.ulfric.commons.naming.Name;

import java.util.HashMap;
import java.util.Map;

@Name("is")
@Permission("is.use")
public class IsCommand implements Command {

	@Argument
	protected Player target;

	@Override
	public void run(Context context) {
		// TODO help menu
	}

	protected Map<String, String> details() {
		Map<String, String> details = new HashMap<>();
		details.put("target", target.getName());
		return details;
	}

}