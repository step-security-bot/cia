/*
 * Copyright 2010-2025 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.impl.email;

/**
 * The Interface EmailService.
 */
@FunctionalInterface
public interface EmailService {

	/**
	 * Send email.
	 *
	 * @param toEmail
	 *            the to email
	 * @param subject
	 *            the subject
	 * @param content
	 *            the content
	 */
	void sendEmail(String toEmail, String subject, String content);

}
