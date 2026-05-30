# Validating And Mutating Controls

Admission controllers commonly perform:
- validation
- or mutation.

These mechanisms allow the platform to:
- reject
- or modify requests.

---

# Validating Controls

Validation determines:

Should this resource be allowed?

Examples include:
- privileged container checks
- required labels
- approved registries
- security requirements

---

# Mutating Controls

Mutation determines:

Should this resource be modified automatically?

Examples include:
- adding labels
- injecting sidecars
- applying defaults
- enforcing standards

---

# Runtime Governance Benefits

Validation protects the platform.

Mutation improves consistency.

---

# Platform Engineering Perspective

Admission control provides both:
- enforcement
- and standardization.

---

# Key Insight

Platforms should validate what is unsafe and automate what is repetitive.
