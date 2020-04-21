@Override
public void run() {
	
	while (isPlaying) {

		// Update 10 times a second
		if(updateRequired()) {
			update();
			draw();
		}

	}
}    

public void pause() {
	isPlaying = false;
	try {
		thread.join();
	} catch (InterruptedException e) {
		// Error
	}
}

public void resume() {
	isPlaying = true;
	thread = new Thread(this);
	thread.start();
}
