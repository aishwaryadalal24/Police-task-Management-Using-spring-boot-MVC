#Most-Fair Program Edited on 01-03-2021
import plotly.offline
import plotly.graph_objs as go
import numpy as np
import datetime as dt
import csv
import time
xs=[0]
ys=[0]
f=open("C:\\Users\\Dell\\Documents\\SpringLab\\Police_smart_app\\src\\main\\webapp\\views\\pyj\\crimes.txt","r")
with open('C:\\Users\\Dell\\Documents\\SpringLab\\Police_smart_app\\src\\main\\webapp\\views\\pyj\\crimes.txt') as csv_file:
    read_csv=csv.reader(csv_file,delimiter=",")
    for row in read_csv:
        for r in range(10,0,-1):
            ys.append(int(row[0-r]))
            
        for d in range(9,0,-1):
            date=(dt.datetime.today()-dt.timedelta(days=d)).strftime("%d-%m-%Y")
            xs.append(str(date))
        xs.append(dt.datetime.today().strftime("%d-%m-%Y"))
            
        xs = xs[-10:]
        ys = ys[-10:]

to_plot=go.Scatter(x=xs,y=ys)
data=[to_plot]
plotly.offline.plot({ "data": data,"layout": go.Layout(title = "Crime-Rate")}, auto_open = True)