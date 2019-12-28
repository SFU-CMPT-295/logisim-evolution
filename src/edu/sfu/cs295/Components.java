package edu.sfu.cs295; // com.cburch.incr;

import java.util.Arrays;
import java.util.List;

import com.cburch.logisim.tools.AddTool;
import com.cburch.logisim.tools.Library;
import com.cburch.logisim.tools.Tool;

public class Components extends Library {
    private List<Tool> tools;

    public Components() {
        // Removed components from list 2/19/2019, will replace for P3
        tools = Arrays.asList(new Tool[] {
                new AddTool(new RegisterFile32()),
                new AddTool(new Program32()),
                new AddTool(new ALU()),
                new AddTool(new Comparator()),
                new AddTool(new Incrementer()),
                new AddTool(new Video()),
                new AddTool(new Ram()),
                new AddTool(new SPIM()),
                // new AddTool(new RamIO())
        });
    }

    @Override
    public String getName() { return "CS295-Components"; }
    @Override
    public String getDisplayName() { return "CS295 Components"; }
    @Override
    public List<Tool> getTools() { return tools; }
    public boolean removeLibrary(String Name) {
    	return false;
    }
}