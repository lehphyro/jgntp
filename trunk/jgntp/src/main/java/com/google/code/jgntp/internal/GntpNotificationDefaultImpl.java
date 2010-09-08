/*
 * Copyright (C) 2010 Leandro de Oliveira Aparecido <lehphyro@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.code.jgntp.internal;

import java.awt.image.*;
import java.net.*;

import com.google.code.jgntp.*;

public class GntpNotificationDefaultImpl implements GntpNotification {

	private final String applicationName;
	private final String name;
	private final String id;
	private final String title;
	private final String text;
	private final Boolean sticky;
	private final Priority priority;
	private final RenderedImage iconImage;
	private final URI iconUri;
	private final String coalescingId;
	private final URI callbackTarget;
	private final boolean callbackRequested;
	private final Object context;

	public GntpNotificationDefaultImpl(String applicationName, String name, String id, String title, String text, Boolean sticky, Priority priority, RenderedImage iconImage, URI iconUri,
			String coalescingId, URI callbackTarget, boolean callbackRequested, Object context) {
		this.applicationName = applicationName;
		this.name = name;
		this.id = id;
		this.title = title;
		this.text = text;
		this.sticky = sticky;
		this.priority = priority;
		this.iconImage = iconImage;
		this.iconUri = iconUri;
		this.coalescingId = coalescingId;
		this.callbackTarget = callbackTarget;
		this.callbackRequested = callbackRequested;
		this.context = context;
	}

	@Override
	public String getApplicationName() {
		return applicationName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public Boolean isSticky() {
		return sticky;
	}

	@Override
	public Priority getPriority() {
		return priority;
	}

	@Override
	public RenderedImage getIconImage() {
		return iconImage;
	}

	@Override
	public URI getIconUri() {
		return iconUri;
	}

	@Override
	public String getCoalescingId() {
		return coalescingId;
	}

	@Override
	public URI getCallbackTarget() {
		return callbackTarget;
	}

	@Override
	public Object getContext() {
		return context;
	}

	@Override
	public boolean isCallbackRequested() {
		return callbackRequested;
	}

	@Override
	public String toString() {
		return String.format("application=%s, name=%s, title=%s, text=%s", applicationName, name, title, text);
	}

}