#!/bin/env python
# -*- coding: utf-8 -*-

# 依赖pywin32, win32gui PIL
# 打开扫雷，然后运行脚本，全自动扫雷，Win键强制退出

import random
import win32api
import win32gui
import win32con
import sys
import os
from PIL import ImageGrab

# 查找扫雷游戏窗口
class_name = "Tmain"
title_name = "Minsweeper Arbiter "
hwnd = win32gui.FindWindow(class_name, title_name)

# 窗口坐标
left = 0
top = 0
right = 0
bottom = 0

if hwnd:
    print("找到扫雷软件窗口")
    left, top, right, bottom = win32gui.GetWindowRect(hwnd)
    # win32gui.SetForegroundWindow(hwnd)
    print("窗口坐标为： ")
    print(str(left)+' '+str(right)+' '+str(top)+' '+str(bottom))
else:
    print("没有找到扫雷窗口，请先打开扫雷，然后运行本脚本！ ")

# 雷区坐标，扫雷软件相对比较稳定，雷区位置不变
left += 15
top += 101
right -= 14
bottom -= 42

# 截图雷区图像
rect = (left, top, right, bottom)
img = ImageGrab.grab().crop(rect)

# 雷区每个方块16*16
block_width, block_height = 16, 16
# 计算横向有blocks_x个方块
blocks_x = int((right - left) / block_width)
# 计算纵向有blocks_y个方块
blocks_y = int((bottom - top) / block_height)

# 各种旗帜颜色，多点判断
rgba_ed = [(225, (192,192,192)), (31, (128,128,128))]
rgba_red = [(54, (255,255,255)), (17, (255,0,0)), (109, (192,192,192)), (54, (128,128,128)), (22, (0,0,0))]
rgba_0 = [(54, (255,255,255)), (148, (192,192,192)), (54, (128,128,128))]
rgba_1 = [(185, (192,192,192)), (31, (128,128,128)), (40, (0,0,255))]
rgba_2 = [(160, (192,192,192)), (31, (128,128,128)), (65, (0,128,0))]
rgba_3 = [(62, (255,0,0)), (163, (192,192,192)), (31, (128,128,128))]
rgba_4 = [(169, (192,192,192)), (31, (128,128,128)), (56, (0,0,128))]
rgba_5 = [(70, (128,0,0)), (155, (192,192,192)), (31, (128,128,128))]
rgba_6 = [(153, (192,192,192)), (31, (128,128,128))]