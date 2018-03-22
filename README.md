# leJos_EV3_Azimuth_Movement
#  Description of the project
The task I've worked on was to implement azimuth movement for a lego-robot using PID controller.
What is an azimuth movement? It's keeping the indicated (planned) direction of movement and distance.

As a result I have a robot which go forward all the time(until you didn't press stop button) and, in case you take him off or turn,  returns to his initial trajectory.
To track angle deviation from the initial point I used Gyro sensor which works as hyroscope.
# Description of the work process (problems, solution)
My work consists of 3 main parts:
1) Firstly, I collected a robot from lego brigs(that was the most interesting part:))
2) Then, worked on software installation and establishment(I used leJos plugin on Eclipse IDE).
3) Wrote a program.
4) Finally, tested written program and picked up necessary coefficients

Problems - mainly on sw installation part. I had big problem wih SD - several robots refused to see sw on it for running java lejos project, so it takes a long time - I just got another microSD that solved my problem.

As far as Control Theory is concerned, working with motors and overall robot was not complicated as well as with sensor but implementing PID was really challenging.
Unforunately, there's very small amount of material on azimuth movement

# Explanation of the result values (how you got them)

# Why I think this values are the best
uBecause when I s
# Link to youtube video with robot movemnets

https://www.youtube.com/watch?v=yeYtpwVxGRY
