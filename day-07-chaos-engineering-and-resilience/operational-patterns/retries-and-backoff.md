# Retries And Backoff

Retries help recover from:
- temporary transient failures.

Examples:
- network instability
- temporary dependency overload
- or intermittent timeouts.

---

# Retry Flow

Dependency becomes temporarily unavailable
→ Request fails
→ Application retries
→ Dependency recovers
→ Request succeeds

---

# The Danger Of Aggressive Retries

Uncontrolled retries may amplify:
- operational pressure.

Example:

Dependency slows down
→ Requests timeout
→ Clients retry aggressively
→ More traffic generated
→ Dependency overload worsens

---

# Exponential Backoff

Backoff reduces:
- retry amplification.

Instead of retrying instantly,
systems progressively wait longer between retries.

Example:
- 1 second
- 2 seconds
- 4 seconds
- 8 seconds

---

# Operational Benefits

Backoff helps:
- reduce retry storms
- stabilize dependencies
- and improve recovery behavior.

---

# Key Insight

Retries improve resilience,
but uncontrolled retries may amplify distributed-system failures.
