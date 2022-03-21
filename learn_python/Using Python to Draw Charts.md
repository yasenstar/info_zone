# Using Python to Draw Charts

Install pyecharts

```python
pip install pyecharts
```

## Bar Charts

```python
// import bar chart
from pyecharts import Bar
// Set line name
columns = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
// Set data
data1 = [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
data2 = [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
// Set bar chart's main title and sub title
bar = Bar("Bar Chart", "一年的降水量和蒸发量")
// Add data and config items into Bar chart
bar.add("降水量", columns, data1, mark_line=["average"], mark_point=["max", "min"])
bar.add("蒸发量", columns, data2, mark_line=["average"], mark_point=["max", "min"])
// Generate local file (default is .html)
bar.render()
```

## Line Charts

```python
from pyecharts import Line
line = Line("Line Chart", "一年的降水量和蒸发量")
// Add data and config items into Linechart
line.add("降水量", columns, data1, is_label_show=True)
line.add("蒸发量", columns, data2, is_label_show=True)
// Generate local file (default is .html)
line.render()
```
