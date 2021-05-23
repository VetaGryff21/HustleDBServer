#!/usr/bin/python
# -*- coding: utf-8 -*-

import csv
import re
import pandas as pd

DF = pd.read_csv("dancersCSV2.csv", comment='#', sep=',')
DF2 = pd.read_csv("dancersCSVclassic.csv", comment='#', sep=';')

is_same = DF["code"] != DF2["code"]
print(is_same.sum())

DF3 = pd.merge(DF, DF2, on=("code"))
print(DF3)

DF3.to_csv("dancersCSVdb.csv", index=False)