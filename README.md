ActivityResumed
===============

A simple example of how the activity stopped could be resumed.

This app has 2 activities: Main Activity and Second activity. Both of them has a button in the middle. The button of the Main activity starts the second activity an the button of the second activity starts the main activity.

The difference here is because the main activity has started another activity, when the second activity starts, it won't be destroyed (at least in a non-extreme case). Then it will remain stopped. So, when the second activity starts the first activity, it adds the flag Intent.FLAG_ACTIVITY_REORDER_TO_FRONT. This flag allow to resume the activity if it has been stopped. The good part of this flag is when the activity was destroyed, it won't create any error. Instead, a new activity will be created.
