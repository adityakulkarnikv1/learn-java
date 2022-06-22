package com.Hashmap;
import java.util.ArrayList; 
02.import java.util.List; 
03.import java.util.regex.Matcher; 
04.import java.util.regex.Pattern; 
05. 
 
06.public class GenericTreeNode<T> { 
07. 
 
08.    
public T data; 
09.    
public List<GenericTreeNode<T>> children; 
10. 
 
11.    
public GenericTreeNode() { 
12.        
super(); 
13.        
children = new ArrayList<GenericTreeNode<T>>(); 
14.    
} 
15. 
 
16.    
public GenericTreeNode(T data) { 
17.        
this(); 
18.        
setData(data); 
19.    
} 
20. 
 
21.    
public List<GenericTreeNode<T>> getChildren() { 
22.        
return this.children; 
23.    
} 
24. 
 
25.    
public int getNumberOfChildren() { 
26.        
return getChildren().size(); 
27.    
} 
28. 
 
29.    
public boolean hasChildren() { 
30.        
return (getNumberOfChildren() > 0); 
31.    
} 
32. 
 
33.    
public void setChildren(List<GenericTreeNode<T>> children) { 
34.        
this.children = children; 
35.    
} 
36. 
 
37.    
public void addChild(GenericTreeNode<T> child) { 
38.        
children.add(child); 
39.    
} 
40. 
 
41.    
public void addChildAt(int index, GenericTreeNode<T> child) throws IndexOutOfBoundsException { 
42.        
children.add(index, child); 
43.    
} 
44. 
 
45.    
public void removeChildren() { 
46.        
this.children = new ArrayList<GenericTreeNode<T>>(); 
47.    
} 
48. 
 
49.    
public void removeChildAt(int index) throws IndexOutOfBoundsException { 
50.        
children.remove(index); 
51.    
} 
52. 
 
53.    
public GenericTreeNode<T> getChildAt(int index) throws IndexOutOfBoundsException { 
54.        
return children.get(index); 
55.    
} 
56. 
 
57.    
public T getData() { 
58.        
return this.data; 
59.    
} 
60. 
 
61.    
public void setData(T data) { 
62.        
this.data = data; 
63.    
} 
64. 
 
65.    
public String toString() { 
66.        
return getData().toString(); 
67.    
} 
68. 
 
69.    
public boolean equals(GenericTreeNode<T> node) { 
70.        
return node.getData().equals(getData()); 
71.    
} 
72. 
 
73.    
public int hashCode() { 
74.        
return getData().hashCode(); 
75.    
} 
76. 
 
77.    
public String toStringVerbose() { 
78.        
String stringRepresentation = getData().toString() + ":["; 
79. 
 
80.        
for (GenericTreeNode<T> node : getChildren()) { 
81.            
stringRepresentation += node.getData().toString() + ", "; 
82.        
} 
83. 
 
84.        
//Pattern.DOTALL causes ^ and $ to match. Otherwise it won't. It's retarded. 
85.        
Pattern pattern = Pattern.compile(", $", Pattern.DOTALL); 
86.        
Matcher matcher = pattern.matcher(stringRepresentation); 
87. 
 
88.        
stringRepresentation = matcher.replaceFirst(""); 
89.        
stringRepresentation += "]"; 
90. 
 
91.        
return stringRepresentation; 
92.    
} 
}